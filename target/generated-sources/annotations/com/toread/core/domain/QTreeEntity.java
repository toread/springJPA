package com.toread.core.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTreeEntity is a Querydsl query type for TreeEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTreeEntity extends EntityPathBase<TreeEntity> {

    private static final long serialVersionUID = -1509743508L;

    public static final QTreeEntity treeEntity = new QTreeEntity("treeEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath depth = createString("depth");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath parentUuid = createString("parentUuid");

    public QTreeEntity(String variable) {
        super(TreeEntity.class,  forVariable(variable));
    }

    public QTreeEntity(Path<? extends TreeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTreeEntity(PathMetadata<?> metadata) {
        super(TreeEntity.class,  metadata);
    }

}

