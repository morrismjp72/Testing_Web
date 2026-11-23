package com.webcuratar

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ScreenshotKeywords {

	@Keyword
	def takeShot(String name) {
		String path = "Screenshots/${name}_${new Date().format('yyyyMMdd_HHmmss')}.png"
		WebUI.takeScreenshot(path)
		return path
	}
}