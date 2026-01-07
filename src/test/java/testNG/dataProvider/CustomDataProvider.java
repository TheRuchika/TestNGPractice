package testNG.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomDataProvider {


    @DataProvider
    public Object[] [] getData() {
        Object[][] data = {
                {"abc@gmail.com", "abc123"}, {"def@gmail.com", "abc123"}, {"xy@gmail.com", "abc1234"}
        };
        return data;
    }
}
