package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object TrueURL
     
    /**
     * <p></p>
     */
    public static Object Name
     
    /**
     * <p></p>
     */
    public static Object Email
     
    /**
     * <p></p>
     */
    public static Object Subject
     
    /**
     * <p></p>
     */
    public static Object Noted
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables('default')
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            TrueURL = selectedVariables['TrueURL']
            Name = selectedVariables['Name']
            Email = selectedVariables['Email']
            Subject = selectedVariables['Subject']
            Noted = selectedVariables['Noted']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
