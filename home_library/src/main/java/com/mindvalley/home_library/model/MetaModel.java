package com.mindvalley.home_library.model;

public class MetaModel {

   private int total;
    private int page;
    private int limit;
    private String previous;
    private String next;


   public int getTotal() {
        return total;
    }

   public int getPage() {
        return page;
    }

   public int getLimit() {
        return limit;
    }

   public String getPrevious() {
        return previous;
    }

   public String getNext() {
        return next;
    }


}