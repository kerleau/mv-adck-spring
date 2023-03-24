package com.alex.framework.mvacspringbootapi.model;

import lombok.AllArgsConstructor;
// Importing class
import lombok.Data;
import lombok.NoArgsConstructor;

// Annotation
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {

    long id;
    String content;
    // public  Greeting(long id , String content){
    //     this.id = id;
    //     this.content = content;
    // }

}