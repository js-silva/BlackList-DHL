package blacklist.persist.repository;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import blacklist.persist.entity.STBlackList;


public interface STBlackListRepository extends JpaRepository<STBlackList, String> {


	@Query("SELECT stBL FROM STBlackList stBL WHERE stBL.pcsIdShipId = :pcsIdshipId")
	List<STBlackList>	findByPcsIdShipId(@Param("pcsIdshipId") Long pcsIdshipId, Sort sort);
}
