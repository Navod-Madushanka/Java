/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX2;

/**
 *
 * @author Navod Madusanka
 */
interface Hotel{
    public Menu getMenu();
}

interface HotelProvider{
    public VegMenu vegMenu();
    public NonvegMenu nonvegMenu();
    public Both bothMenu();
}

class VegHotel implements Hotel{

    @Override
    public Menu getMenu() {
        VegMenu nvm = new VegMenu();
        return nvm;
    }
    
}

public class FacadePractical {
    public static void main(String[] args) {
        
    }
}
