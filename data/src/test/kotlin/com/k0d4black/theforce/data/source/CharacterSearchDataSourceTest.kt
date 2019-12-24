package com.k0d4black.theforce.data.source

import com.google.common.truth.Truth
import com.k0d4black.theforce.data.BaseTest
import com.k0d4black.theforce.data.helpers.EXISTING_SEARCH_PARAMS
import com.k0d4black.theforce.data.helpers.NON_EXISTENT_SEARCH_PARAMS
import com.k0d4black.theforce.domain.utils.Success
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test


class CharacterSearchDataSourceTest : BaseTest() {
    private lateinit var characterSearchDataSource: CharacterSearchDataSource

    @Before
    override fun setup() {
        super.setup()
        characterSearchDataSource =
            CharacterSearchDataSource(
                starWarsApiService
            )
    }

    @Test
    fun `given search parameters when parameters exist then get available matching characters`() {
        runBlocking {
            val response = characterSearchDataSource.query(EXISTING_SEARCH_PARAMS)
            Truth.assertThat(response).isInstanceOf(Success::class.java)
        }
    }

    @Test
    fun `given search parameters when parameters dont exist then get no matching characters`() {
        runBlocking {
            val response = characterSearchDataSource.query(NON_EXISTENT_SEARCH_PARAMS)
            Truth.assertThat(response).isInstanceOf(Success::class.java)

        }

    }
}