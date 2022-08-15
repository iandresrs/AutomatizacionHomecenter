package com.homecenter.Models;

public class EsperaImplicita {

    public void EsperaImplicita(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace(System.out);
        }
    }
}
