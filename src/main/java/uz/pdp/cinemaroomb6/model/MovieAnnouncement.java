package uz.pdp.cinemaroomb6.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.cinemaroomb6.model.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "movie_announcements")
public class MovieAnnouncement extends AbsEntity {

    @ManyToOne
    private Movie movie;
    private boolean isActive;

}
