package capstone.bapool.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QParty is a Querydsl query type for Party
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QParty extends EntityPathBase<Party> {

    private static final long serialVersionUID = 526379155L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QParty party = new QParty("party");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath detail = createString("detail");

    public final DateTimePath<java.time.LocalDateTime> endDate = createDateTime("endDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isClose = createBoolean("isClose");

    public final NumberPath<Integer> maxPeople = createNumber("maxPeople", Integer.class);

    public final StringPath menu = createString("menu");

    public final StringPath name = createString("name");

    public final QRestaurant restaurant;

    public final DateTimePath<java.time.LocalDateTime> startDate = createDateTime("startDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QParty(String variable) {
        this(Party.class, forVariable(variable), INITS);
    }

    public QParty(Path<? extends Party> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QParty(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QParty(PathMetadata metadata, PathInits inits) {
        this(Party.class, metadata, inits);
    }

    public QParty(Class<? extends Party> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
    }

}

