package com.marvellous.MarvellousFullStack.Entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

// pojo class - class which has getter/setter methods and avoids boilerplate code
@Document(collection = "BatchDetails")
@Getter
@Setter
public class BatchEntry
{
    private ObjectId id;
    private String Name;
    private int Fees;
}
