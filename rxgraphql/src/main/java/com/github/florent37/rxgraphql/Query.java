package com.github.florent37.rxgraphql;

import java.util.List;

/**
 * Created by florentchampigny on 23/05/2017.
 */

public class Query<T> extends AbstractQuery<T> {

    public Query(RxGraphQl rxGraphQl, String query) {
        super(rxGraphQl, "query", query);
    }

    public <R> Query<R> cast(Class<R> theClass){
        super.castClass(theClass);
        return (Query<R>)this;
    }

    @Deprecated
    public <R> Query<List<R>> castList(Class<R> theClass) {
        super.castClassList(theClass);
        return (Query<List<R>>)this;
    }

    public Query<T> field(String name, String value){
        super.injectField(name, value);
        return this;
    }
}
