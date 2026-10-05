package Model;

public class Main {
	
	public static void main(String[] args) {

        Project_PBL file = new Project_PBL(
                "Report.pdf",
                "C:\\Documents",
                "PDF",
                2500
        );

        file.createFile();
        file.displayFileInfo();
        file.renameFile();
        file.deleteFile();
    }

}
