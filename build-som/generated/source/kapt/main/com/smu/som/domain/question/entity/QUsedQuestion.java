package com.smu.som.domain.question.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUsedQuestion is a Querydsl query type for UsedQuestion
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUsedQuestion extends EntityPathBase<UsedQuestion> {

    private static final long serialVersionUID = -1096736365L;

    public static final QUsedQuestion usedQuestion = new QUsedQuestion("usedQuestion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> pass = createNumber("pass", Long.class);

    public final NumberPath<Long> used = createNumber("used", Long.class);

    public final StringPath userId = createString("userId");

    public QUsedQuestion(String variable) {
        super(UsedQuestion.class, forVariable(variable));
    }

    public QUsedQuestion(Path<? extends UsedQuestion> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsedQuestion(PathMetadata metadata) {
        super(UsedQuestion.class, metadata);
    }

}

