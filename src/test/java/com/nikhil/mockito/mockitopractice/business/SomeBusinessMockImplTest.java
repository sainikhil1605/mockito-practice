package com.nikhil.mockito.mockitopractice.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class SomeBusinessMockImplTest {

    @Test
    void test(){
        DataService dataServiceMock=mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3});
        SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceMock);
        int result= businessImpl.findTheGreatestFromAllData();
        assertEquals(3,result);
    }
}



