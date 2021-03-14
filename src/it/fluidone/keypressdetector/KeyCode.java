/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.fluidone.keypressdetector;

/**
 *
 * @author fluidone
 */
public class KeyCode {
    
    private int code;
    private String hex;
    private String binary;
    private String html;
    private String name;
    private String description;
    
    public KeyCode() {
        
    }
    
    public KeyCode(int code, String hex, String binary, String html, String name, String description) {
        this.code = code;
        this.hex = hex;
        this.binary = binary;
        this.html = html;
        this.name = name;
        this.description = description;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return this.code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }
    
        /**
     * @return the hex
     */
    public String getHex() {
        return this.hex;
    }

    /**
     * @param hex the hex to set
     */
    public void setHex(String hex) {
        this.hex = hex;
    }

    /**
     * @return the binary
     */
    public String getBinary() {
        return this.binary;
    }

    /**
     * @param binary the binary to set
     */
    public void setBinary(String binary) {
        this.binary = binary;
    }

    /**
     * @return the html
     */
    public String getHtml() {
        return this.html;
    }

    /**
     * @param html the html to set
     */
    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        String msg = "Pressed: %d : %s (%s)";
        return String.format(msg, this.code, this.description, this.name);
    }
    
    public String toDisplay() {
        
        String msg = "Code: '%d'\n\r";
        msg += "Binary: '%s'\n";
        msg += "Hex: '%s'\n";
        msg += "HTML: '%s'\n";
        msg += "Char: '%s'\n";
        msg += "Description: '%s'\n";
        
        return String.format(
            msg, 
            this.code,
            this.binary,
            this.hex,
            this.html,
            this.name, 
            this.description
        );
    }
}
