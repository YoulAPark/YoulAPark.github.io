package kr.happyjob.study.admstd.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.admstd.model.AdmstdStrMngModel;

public interface AdmstdStrMngDao {

	/*	리스트 전체출력 admstdStrList
	 	단 건 출력 admstdStrOne
	 	count기능 admstdCnt
	 	창고 등록 admstdAdd
	 	창고 삭제 admstdDel
	 	창고 수정 admstdUpdate
	 	검색(로그인아이디) searchId
	 	검색(이름) searchName	 */
	
	// 1. [SELECT] 리스트 전체 출력
	public List<AdmstdStrMngModel> admstdStrList(Map<String,Object> map) throws Exception;
	
	// 2. [SELECT] 단 건 출력
	public List<AdmstdStrMngModel> admstdStrOne() throws Exception;
	
	// 3. [SELECT] count 출력
	public int admstdCnt() throws Exception;
	
	// 4. [INSERT] 창고 등록
	public void admstdAdd() throws Exception;
	
	// 5. [UPDATE] 창고 수정
	public void admstdUpdate() throws Exception;
	
	// 6. [DELETE] 창고 삭제
	public void admstdDel() throws Exception;
	
	// 7. [SELECT] 로그인아이디 검색
	public List<AdmstdStrMngModel> searchId() throws Exception;
	
	// 8. [SELECT] 이름 검색
	public List<AdmstdStrMngModel> searchName(String name) throws Exception;
	
	
	
	
}
