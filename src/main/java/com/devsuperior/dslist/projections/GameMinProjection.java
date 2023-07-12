package com.devsuperior.dslist.projections;

public interface GameMinProjection { //interface para consulta SQL customizada

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
