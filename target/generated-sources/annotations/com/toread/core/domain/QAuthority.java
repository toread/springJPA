package com.toread.core.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QAuthority is a Querydsl query type for Authority
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAuthority extends EntityPathBase<Authority> {

    private static final long serialVersionUID = 1834738328L;

    public static final QAuthority authority = new QAuthority("authority");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final ListPath<Person, QPerson> persons = this.<Person, QPerson>createList("persons", Person.class, QPerson.class, PathInits.DIRECT2);

    public final SetPath<Resource, QResource> resources = this.<Resource, QResource>createSet("resources", Resource.class, QResource.class, PathInits.DIRECT2);

    public QAuthority(String variable) {
        super(Authority.class,  forVariable(variable));
    }

    public QAuthority(Path<? extends Authority> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuthority(PathMetadata<?> metadata) {
        super(Authority.class,  metadata);
    }

}

