package com.toread.core.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOrganization is a Querydsl query type for Organization
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrganization extends EntityPathBase<Organization> {

    private static final long serialVersionUID = 1194448318L;

    public static final QOrganization organization = new QOrganization("organization");

    public final QTreeEntity _super = new QTreeEntity(this);

    //inherited
    public final StringPath depth = _super.depth;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    //inherited
    public final StringPath parentUuid = _super.parentUuid;

    public final SetPath<Person, QPerson> persons = this.<Person, QPerson>createSet("persons", Person.class, QPerson.class, PathInits.DIRECT2);

    public QOrganization(String variable) {
        super(Organization.class,  forVariable(variable));
    }

    public QOrganization(Path<? extends Organization> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrganization(PathMetadata<?> metadata) {
        super(Organization.class,  metadata);
    }

}

