package com.github.florent37.rxgraphql;

import java.util.List;

/**
 * Created by florentchampigny on 23/05/2017.
 */

public class Mutation<T> extends AbstractQuery<T> {

    public Mutation(RxGraphQl rxGraphQl, String query) {
        super(rxGraphQl, "mutation", query);
    }

    public <R> Mutation<R> cast(Class<R> theClass){
        super.castClass(theClass);
        return (Mutation<R>)this;
    }

    public <R> Mutation<List<R>> castList(Class<R> theClass) {
        super.castClassList(theClass);
        return (Mutation<List<R>>)this;
    }

    public Mutation<T> field(String name, String value){
        super.injectField(name, value);
        return this;
    }
}
