package com.smu.som.domain.user.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 2068917632L;

    public static final QUser user = new QUser("user");

    public final StringPath ageRange = createString("ageRange");

    public final DateTimePath<java.util.Date> anniversary = createDateTime("anniversary", java.util.Date.class);

    public final StringPath email = createString("email");

    public final EnumPath<Gender> gender = createEnum("gender", Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath maritalStatus = createBoolean("maritalStatus");

    public final StringPath nickname = createString("nickname");

    public final StringPath oauth2Id = createString("oauth2Id");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

