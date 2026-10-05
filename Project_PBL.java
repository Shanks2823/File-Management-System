package Model;

public class Project_PBL implements FileOperations {

    private String fileName;
    private String filePath;
    private String fileType;
    private long fileSize;

    public Project_PBL(String fileName, String filePath, String fileType, long fileSize) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFileType() {
        return fileType;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public void createFile() {
        System.out.println("File created: " + fileName);
    }

    @Override
    public void deleteFile() {
        System.out.println("File deleted: " + fileName);
    }

    @Override
    public void renameFile() {
        System.out.println("File renamed: " + fileName);
    }

    @Override
    public void displayFileInfo() {
        System.out.println("File Name: " + fileName);
        System.out.println("File Path: " + filePath);
        System.out.println("File Type: " + fileType);
        System.out.println("File Size: " + fileSize + " bytes");
    }
}
