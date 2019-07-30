package com.example.demo.entity;


import java.util.List;

/**
 * @author liumao
 * @since 20190719
 */
public class PageManager {
    private int currentPage;
    private int pageSize;
    private int tatalPage;
    private List pageContent;

    public PageManager() {
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getTatalPage() {
        return this.tatalPage;
    }

    public List getPageContent() {
        return this.pageContent;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTatalPage(int tatalPage) {
        this.tatalPage = tatalPage;
    }

    public void setPageContent(List pageContent) {
        this.pageContent = pageContent;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PageManager)) {
            return false;
        }
        final PageManager other = (PageManager) o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getCurrentPage() != other.getCurrentPage()) {
            return false;
        }
        if (this.getPageSize() != other.getPageSize()) {
            return false;
        }
        if (this.getTatalPage() != other.getTatalPage()) {
            return false;
        }
        final Object this$pageContent = this.getPageContent();
        final Object other$pageContent = other.getPageContent();
        return this$pageContent == null ? other$pageContent == null : this$pageContent.equals(other$pageContent);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PageManager;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getCurrentPage();
        result = result * PRIME + this.getPageSize();
        result = result * PRIME + this.getTatalPage();
        final Object $pageContent = this.getPageContent();
        result = result * PRIME + ($pageContent == null ? 43 : $pageContent.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PageManager(currentPage=" + this.getCurrentPage() + ", pageSize=" + this.getPageSize() + ", tatalPage=" + this.getTatalPage() + ", pageContent=" + this.getPageContent() + ")";
    }
}
