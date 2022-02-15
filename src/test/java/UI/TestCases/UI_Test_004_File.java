package UI.TestCases;

import org.testng.annotations.Test;

import java.io.File;

public class UI_Test_004_File {

    @Test
    public void Test_004_CreateFile()
    {

        String path = System.getProperty("user.dir");
        File myDoc = new File(path + ".txt");



    }
}
