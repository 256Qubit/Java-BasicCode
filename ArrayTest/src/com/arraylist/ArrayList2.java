package com.arraylist;

import java.util.ArrayList;

/*
     集合常用成员方法:

         添加:
             boolean add(E e) 将指定的元素添加到此列表的尾部。
             void add(int index, E element) 将指定的元素插入此列表中的指定位置。

         删除:
             public boolean remove(Object o) 删除指定的元素，返回删除是否成功
             public E remove(int index)  删除指定索引处的元素，返回被删除的元素

         修改:
             public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素

         查询:
             public E get(int index) 返回指定索引处的元素
             public int size() 返回集合中的元素的个数

  */
public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }

    private static void testSize() {
        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        int size = list.size();//public int size() 返回集合中的元素的个数
        System.out.println(size);
    }

    /*
    查询:
                 public E get(int index) 返回指定索引处的元素
                 public int size() 返回集合中的元素的个数
     */
    private static void testGet() {
        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        String get0 = list.get(0);
        String get1 = list.get(1);
        String get2 = list.get(2);

        System.out.println(get0);
        System.out.println(get1);
        System.out.println(get2);
    }
/*
修改:
             public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
 */
    private static void testSet() {
        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        String s = list.set(0, "000");
        System.out.println(s);

        System.out.println(list);
    }
/*
删除:
             public boolean remove(Object o) 删除指定的元素，返回删除是否成功
             public E remove(int index)  删除指定索引处的元素，返回被删除的元素
 */
    private static void testRemove() {
        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        boolean b1 = list.remove("abc");
        boolean b2 = list.remove("666");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(list);
    }
}
