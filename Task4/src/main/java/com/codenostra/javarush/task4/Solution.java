/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codenostra.javarush.task4;

/**
 *
 * @author hazrat
 */
public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        //напишите тут ваш код
        var d = Double.parseDouble(string);
        var longVal = Math.round(d);
        System.out.println(longVal);
    }
}
