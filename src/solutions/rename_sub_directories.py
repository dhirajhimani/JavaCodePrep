# Pythono3 code to rename sub directories
  
# importing os module 
import os,sys
  

string_to_replace_space = " "
string_to_replace_dot = "."


# Function to rename multiple files 
def main(directory_path): 
    print(directory_path)
    for filename in os.listdir(directory_path):
        dst = filename
        #print(dst)
        dst = filename.replace(string_to_replace_space, "")

        if os.path.isdir(directory_path + "/" + dst):
            dst = dst.replace(string_to_replace_dot, "")
        #print(dst)
        os.rename(directory_path + "/" + filename, directory_path + "/" + dst)
        
        newFileName = directory_path + "/" + dst

        if os.path.isdir(newFileName):
            main(newFileName)
        

  
# Driver Code 
if __name__ == '__main__': 
      
    # Calling main() function 
    main(".") 