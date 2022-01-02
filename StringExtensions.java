/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sharj
 */
public class StringExtensions extends AbstractFactory implements IAdapter {

    @Override
    public String safeTrim(String input) {
        if(input == null) return "";
        
        return input.trim();
    }

    @Override
    public boolean isStringEmpty(String input) {
        if(input == null || input == "") return true;
        
        return false;
    }
}
