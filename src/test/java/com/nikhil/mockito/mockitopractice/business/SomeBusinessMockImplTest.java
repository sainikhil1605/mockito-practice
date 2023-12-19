package com.nikhil.mockito.mockitopractice.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockImplTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void test(){
//        DataService dataServiceMock=mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3});
//        SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceMock);
        int result= businessImpl.findTheGreatestFromAllData();
        assertEquals(3,result);
    }
}



