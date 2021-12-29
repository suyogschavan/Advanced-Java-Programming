import java.awt.*;
public class MenuExample extends Frame {

    MenuExample() {
        MenuBar mb = new MenuBar();

        setMenuBar(mb);

        Menu mFile = new Menu("File");
        Menu mEdit = new Menu("Edit");
        Menu mView = new Menu("View");
        

        mb.add(mFile);
        mb.add(mEdit);
        mb.add(mView);

        MenuItem itemOpen = new Menu("Open");
        MenuItem itemSave = new Menu("Save");
        MenuItem itemAbout = new Menu("About");

        mFile.add(itemOpen);
        mFile.add(itemSave);
        mFile.add(itemAbout);

        MenuItem itemCopy = new MenuItem("Copy");
        mEdit.add(itemCopy);

    }
    
    public static void main(String[] args) {
        MenuExample frame = new MenuExample();
        frame.setTitle("Menu");
        frame.setSize(350, 250);
        // frame.setResizable(true);
        frame.setVisible(true);

    }
}
