package com.devssr.BelajarSpringBootWeb.services;

import com.devssr.BelajarSpringBootWeb.model.Mahasiswa;

import java.util.List;

public interface MahasiswaService {

    List <Mahasiswa> listMahasiswa();
    Mahasiswa saveOrUpdate(Mahasiswa mahasiswa);
    Mahasiswa getIdMahasiswa(Integer id);
    void hapus(Integer id);
}
