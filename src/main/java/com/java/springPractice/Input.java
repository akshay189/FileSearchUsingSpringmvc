package com.java.springPractice;

public class Input {
    private String folder_path;
    private String search_key;
    private String thread_count;

    public void setFolder_path(String folder_path) {
        this.folder_path = folder_path;
    }

    public void setSearch_key(String search_key) {
        this.search_key = search_key;
    }

    public void setThread_count(String thread_count) {
        this.thread_count = thread_count;
    }

    public void setSequential(String sequential) {
        this.sequential = sequential;
    }

    public String getFolder_path() {

        return folder_path;
    }

    public String getSearch_key() {
        return search_key;
    }

    public String getThread_count() {
        return thread_count;
    }

    public String getSequential() {
        return sequential;
    }

    private String sequential;
}
