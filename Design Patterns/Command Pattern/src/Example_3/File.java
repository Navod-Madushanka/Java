package Example_3;

public class File {
    private String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }
    public void saveWindowsFile(){
        System.out.println("The "+fileName+" saved in windows");
    }
    public void deleteWindowsFile(){
        System.out.println("The "+fileName+" deleted in windows");
    }
    public void saveMacFile(){
        System.out.println("The "+fileName+" saved in Mac");
    }

    public void deleteMacFile(){
        System.out.println("The "+fileName+" deleted in Mac");
    }
    public void savedLinuxFile(){
        System.out.println("The "+fileName+" saved in Linux");
    }
    public void deleteLinuxFile(){
        System.out.println("The "+fileName+" deleted in Linux");
    }
}
