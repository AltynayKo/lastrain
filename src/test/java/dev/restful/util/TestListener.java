package dev.restful.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.*;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener extends TestListenerAdapter implements ITestListener, IInvokedMethodListener {
    private static final String DELIMITER = "=========================================================================";
    private final Logger log = LogManager.getRootLogger();
    @Override
    public void onTestFailure(ITestResult iTestResult){
        log.info("{} {}", "Test method is failed", iTestResult.getMethod());
    }
/*
    @Override
    public void onTestFailedWithTimeout(ITestResult iTestResult) {
        log.info("{} {}", "Test method is failed with timout", iTestResult.getMethod());
        try {
            //Allure.addAttachment("Page screenshot", FileUtils.openInputStream(saveScreenshot()));
        } catch (IOException e) {
            log.error("Failed in screenshot loading");
            throw new RuntimeException(e);
        }
    }*/

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        log.info("{} {}", "Test method is successfully passed", iTestResult.getMethod());
    }
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            log.info(DELIMITER);
            log.info("{} {}", "Start executing", method.getTestMethod());
            log.info("Description: " + method.getTestMethod().getDescription());
            log.info(DELIMITER);
        }
    }

    /*private File saveScreenshot() {
        waitPageLoad();
        String screenshotPath = null;
        File screenCapture = ((TakesScreenshot) DriverSingleton
                .driver.get())
                .getScreenshotAs(OutputType.FILE);
        try {
            screenshotPath = System.clearProperty("user.dir") + "\\screenshots\\"
                    + getCurrentTimeAsString() + ".png";
            FileUtils.copyFile(screenCapture, new File(screenshotPath));
        } catch (IOException e){
            log.error("Failed to capture screenshot " + e.getLocalizedMessage());
        }
        return screenCapture;
    }*/


    private String getCurrentTimeAsString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH-mm-ss");
        return ZonedDateTime.now().format(formatter);
    }

    /*@Attachment(value = "Error Screenshot", type = "image/png")
    private byte[] captureScreenshotAllure() {
        try {
            return ((TakesScreenshot) DriverSingleton.getDriver()).getScreenshotAs(OutputType.BYTES);
        } catch (Exception e) {
            log.error("Failed to capture screenshot: " + e.getMessage());
            return new byte[0];
        }
    }*/
}
