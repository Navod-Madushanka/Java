/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_1;

/**
 *
 * @author Navod Madusanka
 */
interface Iterator {

    public boolean hasNext();

    public Object next();
}

interface Container {

    public Iterator getIterator();

}

class NameReader implements Container {

    public String names[] = {"Hasitha", "Navod", "Madushanka", "Maithripala"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

    }

}

public class Iterator_Pattern_Demo {

    public static void main(String[] args) {
        NameReader nameReader = new NameReader();
        
        for(Iterator i = nameReader.getIterator(); i.hasNext();){
            String n = (String)i.next();
            System.out.println("Name: "+n);
        }
    }
}
