
package pkgfinal;

import java.io.File;
import javax.swing.filechooser.FileFilter;


public class FileTypeFilter extends FileFilter {
    //File Extensions String
    private final String extension;
    //File Extensions Description
    private final String description;
    
    //Constructor Method
    public FileTypeFilter(String extension,String description){
    //Set Constructor Value
    this.extension=extension;
    this.description=description;
    }
    
    @Override
public boolean accept(File file){
//If File is Returning Directory
if(file.isDirectory()){
return true;
}
//Return File Name with Extension
return file.getName().endsWith(extension);
}

@Override
public String getDescription(){
//Return To Display File Type and Description
return description + String.format("(%s)", extension);
}

    
    
}

