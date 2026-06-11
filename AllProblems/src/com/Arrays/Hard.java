package com.Arrays;

public class Hard {
    public static void main(String[] args) {
        System.out.println(findNCRPosElement(5,4));
    }
    
    public static int findNCRPosElement(int row,int col){
        int ans=1;
        for(int i=0;i<col; i++){
            ans=ans*(row-i)/(i+1);
        }
        return ans;
    }

}
