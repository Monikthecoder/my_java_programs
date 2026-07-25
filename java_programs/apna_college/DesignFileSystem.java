/**
 * 
 * Design File System
 * 
You are asked to design a file system that allows you to create new paths and
associate them with different values.

The format of a path is one or more concatenated strings of the form: I followed
by one or more lowercase English letters. For example, "lab" and "lablc" are
valid paths while an empty string "" and "I" are not.

Implement the FileSystem class:
.
bool createPath(string path, int value)

 Creates a new path and associates a
value to it if possible and returns true.

 Returns false if the path already
exists or its parent path doesn't exist.

. int get(string path) Returns the value associated with path or returns -1
the path doesn't exist.




Input: ["FileSystem","createPath","get"]
[[],["la",1],["la"]]
Output: [null,true,1]

 */
class DesignFileSystem {
    public static void main(String[] args) {
        System.out.println("Design File System");
    }
}