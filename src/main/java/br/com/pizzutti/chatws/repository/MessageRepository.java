package br.com.pizzutti.chatws.repository;

import br.com.pizzutti.chatws.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {}
