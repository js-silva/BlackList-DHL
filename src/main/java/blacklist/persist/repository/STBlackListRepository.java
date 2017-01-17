package blacklist.persist.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import blacklist.persist.entity.STBlackList;


public interface STBlackListRepository extends JpaRepository<STBlackList, String>{

}
