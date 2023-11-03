package smu.som.yut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QQuestion is a Querydsl query type for Question
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQuestion extends EntityPathBase<Question> {

    private static final long serialVersionUID = -299403926L;

    public static final QQuestion question1 = new QQuestion("question1");

    public final EnumPath<smu.som.yut.domain.enums.Category> category = createEnum("category", smu.som.yut.domain.enums.Category.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath isAdult = createString("isAdult");

    public final StringPath question = createString("question");

    public final EnumPath<smu.som.yut.domain.enums.Target> target = createEnum("target", smu.som.yut.domain.enums.Target.class);

    public QQuestion(String variable) {
        super(Question.class, forVariable(variable));
    }

    public QQuestion(Path<? extends Question> path) {
        super(path.getType(), path.getMetadata());
    }

    public QQuestion(PathMetadata metadata) {
        super(Question.class, metadata);
    }

}

