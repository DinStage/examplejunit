package ru.dubrovin.alishevtesting.test;

import org.junit.Test;
import ru.dubrovin.alishevtesting.NetworkUtils;


class NetworkUtilsTest {

    @Test
    void getConnection() {
    }
    @Test(timeout = 1000)
    public  void getConnectionShouldReturnFastedThanOneSecond() {
        NetworkUtils.getConnection();
    }


}