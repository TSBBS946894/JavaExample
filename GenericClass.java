class GenericClass<K,V> {
    K key;V value;
    GenericClass(K key,V value){this.key=key;this.value=value;}
    static <K,V> boolean compare(GenericClass<K,V> p1,GenericClass<K,V> p2){return p1.value==p2.value;}
    public static void main(String[] args){
        GenericClass s1=new GenericClass<String, Integer>("apple",1);
        GenericClass s2=new GenericClass<>(2,5);
        System.out.println(compare(s1,s2));
    }
}