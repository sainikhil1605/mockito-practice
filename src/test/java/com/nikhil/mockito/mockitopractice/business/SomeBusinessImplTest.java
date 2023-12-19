package com.nikhil.mockito.mockitopractice.business;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class SomeBusinessImplTest {

    @Test
    void test(){
        DataServiceStub dataServiceStub=new DataServiceStub();
        SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceStub);
        int result= businessImpl.findTheGreatestFromAllData();
        assertEquals(25,result);
    }
}



// If new methods are added to dataservice we should add here and testing with this is tough
class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{25,15,5};
    }
}