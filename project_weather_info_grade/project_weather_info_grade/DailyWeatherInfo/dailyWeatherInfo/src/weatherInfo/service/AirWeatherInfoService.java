package weatherInfo.service;

import java.sql.SQLException;
import java.util.ArrayList;

import weatherInfo.exception.NotExistException;
import weatherInfo.model.dao.DayAirPollutionDAO;
import weatherInfo.model.dao.DayWeatherDAO;
import weatherInfo.model.dao.FineDustGradeDAO;
import weatherInfo.model.dao.ThiGradeDAO;
import weatherInfo.model.dto.DayAirPollutionDTO;
import weatherInfo.model.dto.DayWeatherDTO;
import weatherInfo.model.dto.FineDustGradeDTO;
import weatherInfo.model.dto.ThiGradeDTO;

public class AirWeatherInfoService {
	private static AirWeatherInfoService instance = new AirWeatherInfoService();
	
	private AirWeatherInfoService(){}
	
	public static AirWeatherInfoService getInstance(){
		return instance;
	}
	
	// ------------------------- DayWeather SERVICE Section --------------------------
	
	public void notExistDayWeather(String date, String stationName) throws NotExistException, SQLException{
		DayWeatherDTO weather = DayWeatherDAO.getOneDayWeather(date, stationName);
		if(weather == null){
			throw new NotExistException("�˻��Ͻ� ��¥�� ������ ��Ī�Ǵ� ��������� �����ϴ�.");
		}
	}
	
	public ArrayList<DayWeatherDTO> getAllDayWeatherData() throws SQLException{
		return DayWeatherDAO.getAllDayWeather();
	}
	
	public DayWeatherDTO getOneDayWeatherData(String date, String stationName) throws SQLException, NotExistException{
		DayWeatherDTO aDayWeather = DayWeatherDAO.getOneDayWeather(date, stationName);
		if(aDayWeather == null){
			throw new NotExistException("�˻��Ͻ� ��������� �����ϴ�.");
		}
		return aDayWeather;
	}
	
	// ---------------------- DayAirPollution SERVICE Section -------------------------
	
	public void notExistDayAirPollution(String date, String location) throws NotExistException, SQLException{
		DayAirPollutionDTO airPollution = DayAirPollutionDAO.getOneDayAirPollution(date, location);
		if(airPollution == null){
			throw new NotExistException("�˻��Ͻ� ��¥�� ������ ��Ī�Ǵ� ���������� ������ �����ϴ�.");
		}
	}
	
	public ArrayList<DayAirPollutionDTO> getAllDayAirPollutionData() throws SQLException{
		return DayAirPollutionDAO.getAllDayAirPollution();
	}
	
	public DayAirPollutionDTO getOneDayAirPollutionData(String date, String location) throws SQLException, NotExistException{
		DayAirPollutionDTO aDayAirPollution = DayAirPollutionDAO.getOneDayAirPollution(date, location);
		if(aDayAirPollution == null){
			throw new NotExistException("�˻��Ͻ� ���������� ������ �����ϴ�.");
		}
		return aDayAirPollution;
	}
	
	// --------------------- Weather & AirPollution Mixed getGRADE SERVICE ---------------------
	
	public ThiGradeDTO getOneDayThiGrade(String date, String stationName) throws SQLException, NotExistException{
		ThiGradeDTO aDayThiGrade = ThiGradeDAO.getThiGrade(date, stationName);
		if(aDayThiGrade == null){
			throw new NotExistException("�˻��Ͻ� �������� ��� ������ �����ϴ�.");
		}
		return aDayThiGrade;
	}
	
	public FineDustGradeDTO getOneDayFineDustGrade(String date, String location) throws SQLException, NotExistException{
		FineDustGradeDTO aDayFineDustGrade = FineDustGradeDAO.getFineDustGrade(date, location);
		if(aDayFineDustGrade == null){
			throw new NotExistException("�˻��Ͻ� �̼����� ��� ������ �����ϴ�.");
		}
		return aDayFineDustGrade;
	}
	
	
}
