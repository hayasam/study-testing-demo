package tw.com.bruce.game.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tw.com.bruce.game.entity.Game;

import javax.persistence.EntityManager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GamesTest {

    @InjectMocks
    private Games game;

    @Mock
    private EntityManager em;

    @Test
    void shouldCreateAGame() {
    }

    @Test
    void shouldFindAGameById() {
    }

    @Test
    void shouldReturnAnEmptyOptionalIfElementNotFound() {
    }
}
