/* IMPORTANT NOTE: 
 * You should NOT use the Java's ArrayList class to implement this PA.
 * All the method signatures may not be provided in this starter code.
 */
class CustomAL<T> implements ListADT<T> {
    
    Object[] data;
    int size;

    /**
     * Construct a default CustomAL. Do this by setting size to 0, and
     * initializing the backing array (i.e., Object[] data) to have an
     * initial capacity of 10
     */
    public CustomAL() {
        //TODO: Implement this method
    }

    /**
     * Construct a CustomAL with initial capacity to be the given
     * capacity and size to be zero
     *
     * @param  capacity                 the initial capacity of the 
     *                                  CustomAL
     * @throws IllegalArgumentException if the specified initial 
     *                                  capacity is negative
     */
    public CustomAL(int capacity){
        //TODO: Implement this method
    }

    /**
     * Resize the backing array to create more space. The capacity of the 
     * array is doubled and all the elements from index 0 to size-1 are 
     * copied to the new array.
     */
    public void resize() {        
        //TODO: Implement this method
    }

    @Override
    /** 
     * Returns true if and only if the specified object is also a list, both
     * lists have the same size, and all corresponding pairs of elements in the
     * two lists are equal.
     * 
     * @return true if the two CustomALs are equal in size and elements;
     *         false otherwise
     */
    public boolean equals(Object obj) {
        //TODO: Implement this method
        return false;
    }

    @Override
    /**
     * Overridden toString method to print the Custom Array List
     * 
     * @return the string representation of the Custom Array List
     */
    public String toString() {
        // NOTE: Do NOT change this method!
        String str = "[";
        for (int i = 0; i < this.size; i++) {
            if (i == this.size - 1)
                str += this.data[i];
            else
                str += (this.data[i] + ", ");
        }
        str += "]";
        return str;
    }

    /**
     * Print the size, capacity, load, and data of the CustomAL
     *
     * load = size / capacity
     */
    public void printDetails() {
        // NOTE: Do NOT change this method!
        System.out.print("size: " + this.size + " | ");
        System.out.print("capacity: " + this.data.length + " | ");
        System.out.print(
                "load: " + (double) this.size / this.data.length + " | ");
        System.out.println("data: " + this.toString());
    }
 
}
