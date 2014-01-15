package com.toread.core.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QResource is a Querydsl query type for Resource
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QResource extends EntityPathBase<Resource> {

    private static final long serialVersionUID = -52385255L;

    public static final QResource resource = new QResource("resource");

    public final QTreeEntity _super = new QTreeEntity(this);

    public final ListPath<Authority, QAuthority> authorities = this.<Authority, QAuthority>createList("authorities", Authority.class, QAuthority.class, PathInits.DIRECT2);

    //inherited
    public final StringPath depth = _super.depth;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    //inherited
    public final StringPath parentUuid = _super.parentUuid;

    public final StringPath path = createString("path");

    public QResource(String variable) {
        super(Resource.class,  forVariable(variable));
    }

    public QResource(Path<? extends Resource> path) {
        super(path.getType(), path.getMetadata());
    }

    public QResource(PathMetadata<?> metadata) {
        super(Resource.class,  metadata);
    }

}

