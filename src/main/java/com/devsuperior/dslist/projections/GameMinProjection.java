package com.devsuperior.dslist.projections;

public interface GameMinProjection { //interface para consulta SQL customizada

    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
