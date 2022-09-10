package solvd.projects.database.interfaces;

import solvd.projects.database.tableclasses.Faculties;

import java.util.List;

public interface IFacultiesDAO extends IBaseDAO<Faculties> {
    List<Faculties> getAllFaculties();
}