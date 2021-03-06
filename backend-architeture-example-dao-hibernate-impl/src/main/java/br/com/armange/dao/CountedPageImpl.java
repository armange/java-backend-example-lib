package br.com.armange.dao;

import java.util.List;

public class CountedPageImpl<T> extends PageImpl<T> implements CountedPage<T> {

    private Long pageCount;
    
    public CountedPageImpl() {}
    
    public CountedPageImpl(final List<T> rows, 
            final int pageNumber, 
            final int pageStart, 
            final int pageSize,
            final Long pageCount) {
        super(rows, pageNumber, pageStart, pageSize);
        
        this.pageCount = pageCount;
    }

    @Override
    public Long getPageCount() {
        return pageCount;
    }
    
    @Override
    public void setPageCount(final Long pageCount) {
        this.pageCount = pageCount;
    }
}
