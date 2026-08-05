package com.sachin.dao;

import com.sachin.dto.Appointment;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface AppointmentDAO {
    int insertAppointment(Appointment appointment);
    Appointment getAppointmentById(int id);
    List<Appointment> getAllAppointments();
    List<Appointment> getAppointmentsByPatient(int patientId);
    List<Appointment> getAppointmentsByDoctor(int doctorId);
    boolean updateAppointment(Appointment appointment);
    boolean updateStatus(int appointmentId, String status);
    boolean deleteAppointment(int id);

    boolean updateStatus(Connection conn, int appointmentId, String status) throws SQLException;
}